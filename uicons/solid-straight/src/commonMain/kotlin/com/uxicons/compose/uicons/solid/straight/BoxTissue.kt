package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxTissue: ImageVector? = null

val Icons.Ss.BoxTissue: ImageVector
    get() = _BoxTissue ?: UXIcon(name = "BoxTissue") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(7f)
                lineTo(0f, 18f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.15f)
                lineToRelative(1f, 6f)
                horizontalLineToRelative(15.69f)
                lineToRelative(1f, -6f)
                horizontalLineToRelative(0.15f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5.85f, 12f)
                horizontalLineToRelative(3.07f)
                lineToRelative(-0.49f, -5.92f)
                lineToRelative(1.99f, -0.17f)
                lineToRelative(0.51f, 6.08f)
                horizontalLineToRelative(2.16f)
                lineToRelative(0.34f, -4.08f)
                lineToRelative(1.99f, 0.17f)
                lineToRelative(-0.33f, 3.92f)
                horizontalLineToRelative(3.07f)
                lineTo(20.09f, 0.01f)
                lineToRelative(-1.07f, -0.01f)
                curveToRelative(-1.07f, -0.01f, -1.82f, 0.7f, -2.4f, 1.22f)
                curveToRelative(-0.29f, 0.27f, -0.87f, 0.78f, -1.1f, 0.78f)
                curveToRelative(-0.25f, -0.0f, -0.83f, -0.52f, -1.12f, -0.78f)
                curveToRelative(-0.57f, -0.52f, -1.36f, -1.22f, -2.35f, -1.22f)
                curveToRelative(-1.06f, -0.01f, -1.84f, 0.7f, -2.42f, 1.22f)
                curveToRelative(-0.29f, 0.27f, -0.87f, 0.78f, -1.1f, 0.78f)
                curveToRelative(-0.25f, -0.0f, -0.83f, -0.52f, -1.12f, -0.78f)
                curveTo(6.81f, 0.7f, 6.02f, -0.01f, 4.99f, 0f)
                lineToRelative(-1.07f, 0.01f)
                lineToRelative(1.93f, 11.99f)
                close()
                moveTo(0f, 24f)
                lineTo(24f, 24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 20f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _BoxTissue = it}
