package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartGlasses: ImageVector? = null

val Icons.Ss.SmartGlasses: ImageVector
    get() = _SmartGlasses ?: UXIcon(name = "SmartGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.01f, 8f)
                curveToRelative(0.05f, -1.7f, 1.36f, -3f, 2.99f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-8.8f)
                lineToRelative(0.9f, 9f)
                horizontalLineToRelative(8.01f)
                lineToRelative(2.52f, -4.76f)
                curveToRelative(0.1f, -0.2f, 0.28f, -0.23f, 0.38f, -0.23f)
                curveToRelative(0.1f, 0f, 0.27f, 0.03f, 0.38f, 0.23f)
                lineToRelative(2.52f, 4.76f)
                horizontalLineToRelative(8.01f)
                lineToRelative(1.1f, -11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _SmartGlasses = it}
