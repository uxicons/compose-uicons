package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Rr.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(10f, 18f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(5f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(7f, 13f)
                curveToRelative(0f, 0.77f, 0.29f, 1.47f, 0.77f, 2.01f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(0.98f, -0.98f, 2.69f, -0.98f, 3.67f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0f)
                lineToRelative(3.43f, -3.43f)
                verticalLineToRelative(-0.38f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(10f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(22f, 13f)
                verticalLineToRelative(-2.79f)
                lineToRelative(-2.02f, 2.02f)
                curveToRelative(-0.98f, 0.98f, -2.69f, 0.98f, -3.67f, 0f)
                lineToRelative(-1.04f, -1.04f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0f)
                lineToRelative(-4.79f, 4.79f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.02f, 0.37f, 0.02f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(17f, 20f)
                lineTo(5f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.74f, 0.27f, -1.45f, 0.77f, -2f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.04f, -0.08f, -1.41f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.33f, -1.41f, 0.08f)
                curveToRelative(-0.82f, 0.92f, -1.28f, 2.1f, -1.28f, 3.34f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _CopyImage = it}
