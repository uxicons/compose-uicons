package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLock: ImageVector? = null

val Icons.Sr.UserLock: ImageVector
    get() = _UserLock ?: UXIcon(name = "UserLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.54f)
                verticalLineToRelative(-1.54f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.54f)
                curveToRelative(-1.2f, 0.69f, -2f, 1.99f, -2f, 3.46f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.48f, -0.81f, -2.77f, -2f, -3.46f)
                close()
                moveTo(18f, 20.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(10f, 20f)
                curveToRelative(0f, 1.53f, 0.58f, 2.94f, 1.53f, 4f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.73f)
                curveToRelative(0f, -4.12f, 2.99f, -7.76f, 7.08f, -8.22f)
                curveToRelative(0.96f, -0.11f, 1.89f, -0.04f, 2.77f, 0.16f)
                curveToRelative(0.62f, 0.15f, 0.89f, 0.84f, 0.64f, 1.42f)
                curveToRelative(-0.31f, 0.73f, -0.49f, 1.52f, -0.49f, 2.36f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _UserLock = it}
