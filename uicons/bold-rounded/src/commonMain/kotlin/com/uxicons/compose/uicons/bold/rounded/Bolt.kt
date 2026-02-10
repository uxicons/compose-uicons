package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Br.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.37f, 24f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, -0.22f)
            arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, -3.19f)
            lineTo(10.12f, 16f)
            horizontalLineTo(7.41f)
            arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.26f, -4.4f)
            lineToRelative(2.89f, -9.2f)
            arcTo(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.3f, 0f)
            horizontalLineToRelative(3.67f)
            arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 4.09f)
            lineTo(15.69f, 7f)
            horizontalLineToRelative(0.9f)
            arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.86f, 5.26f)
            reflectiveCurveToRelative(-5.96f, 10.51f, -5.97f, 10.54f)
            arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.37f, 24f)
            close()
            moveTo(10.3f, 3f)
            arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 0.29f)
            lineToRelative(-2.89f, 9.2f)
            arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 0.35f)
            arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.41f, 13f)
            horizontalLineTo(12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 1.84f)
            lineToRelative(-0.74f, 3.22f)
            reflectiveCurveToRelative(4.18f, -7.39f, 4.21f, -7.42f)
            arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.59f, 10f)
            horizontalLineTo(13.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -2.04f)
            lineTo(14f, 3.02f)
            close()
        }
    }.also { _Bolt = it }
