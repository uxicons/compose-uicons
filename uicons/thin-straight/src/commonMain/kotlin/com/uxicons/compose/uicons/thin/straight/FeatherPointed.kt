package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Ts.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.36f, 0.09f)
                curveToRelative(-2.83f, 0.31f, -11.43f, 1.25f, -18.13f, 7.97f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.51f, 1.51f, -2.32f, 3.61f, -2.21f, 5.75f)
                curveToRelative(0.08f, 1.73f, 0.73f, 3.32f, 1.84f, 4.6f)
                lineTo(0.02f, 23.28f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(4.83f, -4.85f)
                curveToRelative(0.08f, 0.07f, 0.15f, 0.14f, 0.23f, 0.21f)
                curveToRelative(1.35f, 1.11f, 3.01f, 1.66f, 4.69f, 1.66f)
                curveToRelative(2.11f, 0f, 4.24f, -0.85f, 5.84f, -2.52f)
                curveToRelative(4.25f, -4.44f, 6.88f, -10.6f, 7.6f, -17.84f)
                lineToRelative(0.06f, -0.61f)
                lineToRelative(-0.61f, 0.07f)
                close()
                moveTo(15.59f, 17.78f)
                curveToRelative(-2.51f, 2.62f, -6.53f, 2.96f, -9.17f, 0.78f)
                curveToRelative(-0.06f, -0.05f, -0.1f, -0.1f, -0.16f, -0.14f)
                lineToRelative(3.4f, -3.42f)
                horizontalLineToRelative(8.18f)
                curveToRelative(-0.69f, 0.99f, -1.44f, 1.93f, -2.25f, 2.78f)
                close()
                moveTo(10.66f, 14f)
                lineToRelative(4.96f, -4.98f)
                lineToRelative(5.36f, -0.02f)
                curveToRelative(-0.67f, 1.79f, -1.49f, 3.46f, -2.46f, 5.0f)
                horizontalLineToRelative(-7.86f)
                close()
                moveTo(21.34f, 8.0f)
                lineToRelative(-6.14f, 0.02f)
                lineToRelative(-9.64f, 9.69f)
                curveToRelative(-0.93f, -1.1f, -1.48f, -2.46f, -1.55f, -3.94f)
                curveToRelative(-0.09f, -1.86f, 0.61f, -3.68f, 1.92f, -5.0f)
                horizontalLineToRelative(0f)
                curveTo(11.96f, 2.73f, 19.62f, 1.53f, 22.85f, 1.15f)
                curveToRelative(-0.28f, 2.42f, -0.79f, 4.71f, -1.51f, 6.85f)
                close()
            }
        }.also { _FeatherPointed = it}
