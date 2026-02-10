package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Ss.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.62f, 21.0f)
                curveToRelative(-1.65f, 0f, -3.28f, -0.52f, -4.63f, -1.57f)
                lineToRelative(4.42f, -4.42f)
                horizontalLineToRelative(8.87f)
                curveToRelative(-0.81f, 1.24f, -1.73f, 2.39f, -2.73f, 3.44f)
                curveToRelative(-1.62f, 1.69f, -3.79f, 2.56f, -5.93f, 2.56f)
                close()
                moveTo(12.41f, 13f)
                horizontalLineToRelative(8.05f)
                curveToRelative(0.51f, -0.96f, 0.97f, -1.96f, 1.38f, -3f)
                horizontalLineToRelative(-6.43f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(22.81f, 0.08f)
                curveToRelative(-2.73f, 0.3f, -11.04f, 1.21f, -17.55f, 7.73f)
                curveToRelative(-1.54f, 1.54f, -2.36f, 3.68f, -2.26f, 5.86f)
                curveToRelative(0.08f, 1.6f, 0.62f, 3.09f, 1.57f, 4.33f)
                lineToRelative(10.0f, -10.0f)
                horizontalLineToRelative(7.96f)
                curveToRelative(0.67f, -2.14f, 1.12f, -4.42f, 1.36f, -6.82f)
                lineToRelative(0.12f, -1.23f)
                lineToRelative(-1.23f, 0.13f)
                close()
                moveTo(1.48f, 23.93f)
                lineToRelative(4.51f, -4.51f)
                curveToRelative(-0.05f, -0.04f, -0.1f, -0.08f, -0.16f, -0.13f)
                curveToRelative(-0.47f, -0.39f, -0.89f, -0.82f, -1.25f, -1.29f)
                lineTo(0.07f, 22.52f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _FeatherPointed = it}
