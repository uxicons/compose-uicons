package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Bs.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.22f, 4.96f)
                curveTo(18.45f, 1.69f, 16.22f, 0f, 14f, 0f)
                verticalLineTo(3f)
                curveToRelative(0.7f, 0f, 1.57f, 0.65f, 2.08f, 2f)
                arcToRelative(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.63f, 6.05f)
                curveTo(11.45f, 13.07f, 9.4f, 14f, 7.5f, 14f)
                curveToRelative(-2.19f, 0f, -3.54f, -0.61f, -4.02f, -3.73f)
                lineTo(3.29f, 9f)
                horizontalLineTo(0.79f)
                lineTo(0.44f, 10f)
                arcTo(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.5f)
                curveTo(0f, 18.95f, 5.27f, 24f, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                verticalLineToRelative(-0.95f)
                arcTo(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.22f, 4.96f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                arcToRelative(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.16f, -4.78f)
                arcTo(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 17f)
                curveToRelative(4.03f, 0f, 6.95f, -2.5f, 6.95f, -5.95f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, -1.41f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                arcToRelative(4.42f, 4.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.81f, -1.01f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.05f)
                close()
            }
        }.also { _Pepper = it}
