package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Sr.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.66f, 10f)
                horizontalLineToRelative(5.29f)
                curveToRelative(-0.4f, 0.98f, -0.86f, 1.98f, -1.42f, 3f)
                horizontalLineToRelative(-8.12f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.56f, -0.56f, 1.33f, -0.88f, 2.12f, -0.88f)
                close()
                moveTo(9.29f, 13.29f)
                lineToRelative(-4.7f, 4.7f)
                curveToRelative(-0.96f, -1.25f, -1.51f, -2.75f, -1.58f, -4.37f)
                curveToRelative(-0.1f, -2.18f, 0.73f, -4.31f, 2.27f, -5.85f)
                curveTo(10.72f, 2.31f, 17.62f, 0.57f, 21.25f, 0.03f)
                curveToRelative(0.76f, -0.11f, 1.51f, 0.13f, 2.05f, 0.67f)
                curveToRelative(0.54f, 0.54f, 0.78f, 1.28f, 0.67f, 2.03f)
                curveToRelative(-0.17f, 1.16f, -0.55f, 3.06f, -1.28f, 5.27f)
                horizontalLineToRelative(-6.03f)
                curveToRelative(-1.33f, 0f, -2.59f, 0.52f, -3.54f, 1.47f)
                lineToRelative(-3.83f, 3.83f)
                lineToRelative(-0.0f, 0.0f)
                close()
                moveTo(6.01f, 19.4f)
                curveToRelative(1.36f, 1.06f, 3.0f, 1.6f, 4.67f, 1.6f)
                curveToRelative(2.11f, 0f, 4.24f, -0.84f, 5.83f, -2.49f)
                curveToRelative(1.09f, -1.12f, 2.01f, -2.31f, 2.81f, -3.52f)
                horizontalLineToRelative(-8.91f)
                lineToRelative(-4.4f, 4.4f)
                close()
                moveTo(4.59f, 17.99f)
                lineTo(0.29f, 22.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(4.3f, -4.3f)
                curveToRelative(-0.07f, -0.05f, -1.07f, -0.95f, -1.42f, -1.41f)
                close()
            }
        }.also { _FeatherPointed = it}
