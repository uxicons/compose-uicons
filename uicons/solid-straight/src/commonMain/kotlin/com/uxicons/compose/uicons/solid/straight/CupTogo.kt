package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Ss.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 4f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-0.34f, -1.62f)
                curveToRelative(-0.29f, -1.38f, -1.52f, -2.38f, -2.94f, -2.38f)
                lineTo(5.77f, -0f)
                curveToRelative(-1.41f, 0f, -2.65f, 1.0f, -2.94f, 2.38f)
                lineToRelative(-0.34f, 1.61f)
                lineTo(1.0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2.32f, 8f)
                lineToRelative(1.55f, 13.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(10.29f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(1.55f, -13.35f)
                lineTo(2.32f, 8f)
                close()
                moveTo(5.38f, 17f)
                horizontalLineToRelative(13.23f)
                lineToRelative(-0.23f, 2f)
                lineTo(5.62f, 19f)
                lineToRelative(-0.23f, -2f)
                close()
                moveTo(5.03f, 14f)
                lineToRelative(-0.23f, -2f)
                horizontalLineToRelative(14.4f)
                lineToRelative(-0.23f, 2f)
                lineTo(5.03f, 14f)
                close()
            }
        }.also { _CupTogo = it}
