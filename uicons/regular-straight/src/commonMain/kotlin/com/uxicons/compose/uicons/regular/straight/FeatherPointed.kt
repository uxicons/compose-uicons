package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Rs.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 0.08f)
                curveToRelative(-2.73f, 0.3f, -11.04f, 1.21f, -17.55f, 7.73f)
                curveToRelative(-1.54f, 1.54f, -2.36f, 3.68f, -2.26f, 5.86f)
                curveToRelative(0.08f, 1.6f, 0.62f, 3.09f, 1.57f, 4.33f)
                lineTo(0.07f, 22.52f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.51f, -4.51f)
                curveToRelative(1.35f, 1.05f, 2.98f, 1.57f, 4.63f, 1.57f)
                curveToRelative(2.14f, 0f, 4.31f, -0.87f, 5.93f, -2.56f)
                curveToRelative(4.12f, -4.3f, 6.67f, -10.27f, 7.37f, -17.26f)
                lineToRelative(0.12f, -1.23f)
                lineToRelative(-1.23f, 0.13f)
                close()
                moveTo(15.1f, 17.06f)
                curveToRelative(-2.1f, 2.19f, -5.4f, 2.57f, -7.69f, 0.94f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(6.43f)
                curveToRelative(-0.54f, 0.72f, -1.12f, 1.41f, -1.74f, 2.06f)
                close()
                moveTo(12.41f, 13f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(4.28f)
                curveToRelative(-0.45f, 1.05f, -0.95f, 2.05f, -1.52f, 3f)
                horizontalLineToRelative(-5.76f)
                close()
                moveTo(20.45f, 8f)
                horizontalLineToRelative(-5.86f)
                lineToRelative(-8.57f, 8.57f)
                curveToRelative(-0.6f, -0.87f, -0.95f, -1.9f, -1.01f, -3.0f)
                curveToRelative(-0.08f, -1.62f, 0.53f, -3.21f, 1.68f, -4.35f)
                curveToRelative(5.22f, -5.24f, 11.79f, -6.56f, 15.1f, -7.0f)
                curveToRelative(-0.28f, 2.04f, -0.72f, 3.97f, -1.33f, 5.78f)
                close()
            }
        }.also { _FeatherPointed = it}
