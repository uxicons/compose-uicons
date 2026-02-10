package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Ts.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.14f, 15.8f)
                lineToRelative(2.72f, 2.85f)
                lineToRelative(-0.72f, 0.69f)
                lineToRelative(-2.71f, -2.85f)
                curveToRelative(-0.57f, -0.57f, -0.57f, -1.52f, 0.01f, -2.1f)
                lineToRelative(2.71f, -2.75f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(-2.71f, 2.75f)
                curveToRelative(-0.19f, 0.19f, -0.19f, 0.5f, -0.0f, 0.69f)
                close()
                moveTo(14.76f, 11.64f)
                lineTo(14.06f, 12.36f)
                lineTo(16.86f, 15.11f)
                curveToRelative(0.19f, 0.19f, 0.19f, 0.5f, -0.0f, 0.69f)
                lineToRelative(-2.81f, 2.85f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(2.8f, -2.84f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.52f, -0.0f, -2.11f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-19.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(13f)
                close()
                moveTo(4f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(10f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _CodeWindow = it}
