package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Br.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 10f)
            arcToRelative(21.7f, 21.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0.21f)
            verticalLineToRelative(-1.27f)
            lineToRelative(4.61f, -1.91f)
            curveToRelative(0.04f, -0.01f, 0.07f, -0.03f, 0.1f, -0.05f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.34f, -4.26f)
            curveToRelative(-0.05f, -0.04f, -4.43f, -2.46f, -4.43f, -2.46f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.62f, 2.23f)
            verticalLineToRelative(8.38f)
            curveToRelative(-3.64f, 1.18f, -6f, 3.42f, -6f, 6.12f)
            curveToRelative(0f, 3.99f, 5.16f, 7f, 12f, 7f)
            reflectiveCurveToRelative(12f, -3.01f, 12f, -7f)
            reflectiveCurveToRelative(-5.16f, -7f, -12f, -7f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-5.15f, 0f, -9f, -2.11f, -9f, -4f)
            curveToRelative(0f, -1.02f, 1.14f, -2.11f, 3f, -2.9f)
            verticalLineToRelative(2.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-3.25f)
            arcToRelative(17.71f, 17.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -0.25f)
            curveToRelative(5.15f, 0f, 9f, 2.11f, 9f, 4f)
            reflectiveCurveToRelative(-3.85f, 4f, -9f, 4f)
            close()
            moveTo(17f, 17f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
            close()
        }
    }.also { _Golf = it }
