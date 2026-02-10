package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Bs.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.14f, 0.2f)
                curveToRelative(-2.62f, 0.29f, -10.61f, 1.16f, -16.87f, 7.45f)
                curveToRelative(-1.56f, 1.56f, -2.4f, 3.73f, -2.29f, 5.94f)
                curveToRelative(0.07f, 1.43f, 0.53f, 2.81f, 1.32f, 3.99f)
                lineTo(0.01f, 21.87f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.27f, -4.27f)
                curveToRelative(1.29f, 0.88f, 2.79f, 1.31f, 4.31f, 1.31f)
                curveToRelative(2.17f, 0f, 4.36f, -0.88f, 5.99f, -2.58f)
                curveToRelative(3.97f, -4.15f, 6.42f, -9.89f, 7.1f, -16.6f)
                lineTo(23.98f, 0.0f)
                lineToRelative(-1.84f, 0.2f)
                close()
                moveTo(5.97f, 13.45f)
                curveToRelative(-0.07f, -1.37f, 0.45f, -2.71f, 1.42f, -3.68f)
                horizontalLineToRelative(0f)
                curveToRelative(4.43f, -4.45f, 9.95f, -5.83f, 13.18f, -6.34f)
                curveToRelative(-0.26f, 1.6f, -0.63f, 3.13f, -1.11f, 4.57f)
                horizontalLineToRelative(-5.58f)
                lineToRelative(-7.4f, 7.4f)
                curveToRelative(-0.3f, -0.6f, -0.47f, -1.26f, -0.51f, -1.95f)
                close()
                moveTo(18.24f, 11f)
                curveToRelative(-0.34f, 0.69f, -0.7f, 1.36f, -1.1f, 2f)
                horizontalLineToRelative(-4.01f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(3.12f)
                close()
                moveTo(8.59f, 17.53f)
                lineToRelative(1.53f, -1.53f)
                horizontalLineToRelative(4.76f)
                curveToRelative(-0.11f, 0.12f, -0.23f, 0.25f, -0.35f, 0.37f)
                curveToRelative(-1.61f, 1.68f, -4.06f, 2.12f, -5.95f, 1.16f)
                close()
            }
        }.also { _FeatherPointed = it}
