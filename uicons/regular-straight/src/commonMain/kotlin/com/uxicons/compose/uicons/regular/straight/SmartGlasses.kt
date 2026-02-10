package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartGlasses: ImageVector? = null

val Icons.Rs.SmartGlasses: ImageVector
    get() = _SmartGlasses ?: UXIcon(name = "SmartGlasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3.0f, 3.1f)
                lineToRelative(1.09f, 10.9f)
                horizontalLineToRelative(8.01f)
                lineToRelative(2.52f, -4.76f)
                curveToRelative(0.1f, -0.2f, 0.28f, -0.23f, 0.38f, -0.23f)
                curveToRelative(0.1f, 0f, 0.27f, 0.03f, 0.38f, 0.23f)
                lineToRelative(2.52f, 4.76f)
                horizontalLineToRelative(8.01f)
                lineToRelative(1.1f, -11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.9f)
                lineToRelative(-0.1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(21.09f, 17f)
                horizontalLineToRelative(-4.99f)
                lineToRelative(-1.95f, -3.7f)
                curveToRelative(-0.42f, -0.8f, -1.25f, -1.29f, -2.15f, -1.29f)
                curveToRelative(-0.9f, 0f, -1.73f, 0.5f, -2.15f, 1.29f)
                lineToRelative(-1.96f, 3.7f)
                horizontalLineToRelative(-4.99f)
                lineToRelative(-0.6f, -6f)
                horizontalLineToRelative(6.7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1.0f, 0.9f)
                close()
            }
        }.also { _SmartGlasses = it}
