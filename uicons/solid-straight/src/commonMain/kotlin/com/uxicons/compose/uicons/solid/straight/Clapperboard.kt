package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Ss.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                verticalLineToRelative(14f)
                lineTo(0f, 23f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(24f)
                close()
                moveTo(1.5f, 7f)
                horizontalLineToRelative(3.4f)
                lineTo(10.9f, 1f)
                horizontalLineToRelative(-3.4f)
                lineTo(1.5f, 7f)
                close()
                moveTo(17.15f, 1f)
                horizontalLineToRelative(-3.42f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(3.42f)
                lineToRelative(6f, -6f)
                close()
                moveTo(13.98f, 7f)
                horizontalLineToRelative(3.42f)
                lineToRelative(5.4f, -5.4f)
                curveToRelative(-0.5f, -0.38f, -1.12f, -0.6f, -1.8f, -0.6f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(20.23f, 7f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.24f, -0.03f, -0.47f, -0.08f, -0.69f)
                lineToRelative(-3.69f, 3.69f)
                close()
                moveTo(4.67f, 1f)
                horizontalLineToRelative(-1.67f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(1.67f)
                lineTo(4.67f, 1f)
                close()
            }
        }.also { _Clapperboard = it}
