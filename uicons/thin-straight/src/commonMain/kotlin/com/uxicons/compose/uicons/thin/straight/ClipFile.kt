package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipFile: ImageVector? = null

val Icons.Ts.ClipFile: ImageVector
    get() = _ClipFile ?: UXIcon(name = "ClipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 20f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18f, 16f)
                lineTo(6f, 16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(15f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                lineTo(18f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1f)
                lineTo(12f, 3.5f)
                close()
                moveTo(6f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.55f)
                curveToRelative(-0.18f, -0.31f, -0.32f, -0.64f, -0.41f, -1f)
                horizontalLineToRelative(-6.14f)
                close()
                moveTo(19.5f, 0f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(0.25f, 0.31f, 0.47f, 0.64f, 0.65f, 1f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                lineTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.11f)
                curveToRelative(0.18f, -0.36f, 0.4f, -0.69f, 0.65f, -1f)
                horizontalLineToRelative(-5.76f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ClipFile = it}
