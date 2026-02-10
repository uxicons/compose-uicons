package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Upload: ImageVector? = null

val Icons.Sr.Upload: ImageVector
    get() = _Upload ?: UXIcon(name = "Upload", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172.4f, 117.45f)
                lineToRelative(62.42f, -62.44f)
                lineToRelative(-0.15f, 329.34f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                lineToRelative(0f, 0f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                lineToRelative(0.15f, -328.98f)
                lineToRelative(62.12f, 62.14f)
                curveToRelative(8.48f, 8.19f, 21.98f, 7.95f, 30.17f, -0.52f)
                curveToRelative(7.99f, -8.27f, 7.99f, -21.37f, 0f, -29.64f)
                lineTo(301.27f, 18.76f)
                curveToRelative(-24.99f, -25f, -65.51f, -25.01f, -90.51f, -0.03f)
                curveToRelative(-0.01f, 0.01f, -0.02f, 0.02f, -0.03f, 0.03f)
                lineToRelative(-68.5f, 68.52f)
                curveToRelative(-8.19f, 8.48f, -7.95f, 21.98f, 0.52f, 30.17f)
                curveTo(151.02f, 125.43f, 164.13f, 125.43f, 172.4f, 117.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(490.67f, 341.34f)
                lineTo(490.67f, 341.34f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(85.33f)
                curveToRelative(0f, 11.78f, -9.55f, 21.33f, -21.33f, 21.33f)
                horizontalLineToRelative(-384f)
                curveToRelative(-11.78f, 0f, -21.33f, -9.55f, -21.33f, -21.33f)
                verticalLineToRelative(-85.33f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                lineToRelative(0f, 0f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(85.33f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(384f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-85.33f)
                curveTo(512f, 350.89f, 502.45f, 341.34f, 490.67f, 341.34f)
                close()
            }
        }.also { _Upload = it}
