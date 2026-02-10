package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Custard: ImageVector? = null

val Icons.Ss.Custard: ImageVector
    get() = _Custard ?: UXIcon(name = "Custard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.78f, 6f)
                lineToRelative(0.3f, -1.7f)
                curveToRelative(0.34f, -1.92f, 2.0f, -3.31f, 3.94f, -3.31f)
                horizontalLineToRelative(7.97f)
                curveToRelative(1.94f, 0f, 3.6f, 1.39f, 3.94f, 3.31f)
                lineToRelative(0.3f, 1.7f)
                horizontalLineToRelative(-4.22f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.77f, -2f, -0.77f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.77f, -2f, -0.77f)
                horizontalLineToRelative(-3.22f)
                close()
                moveTo(16f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.57f)
                lineToRelative(-1.41f, 8f)
                horizontalLineToRelative(19.97f)
                lineToRelative(-1.41f, -8f)
                horizontalLineToRelative(-4.57f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(4f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _Custard = it}
