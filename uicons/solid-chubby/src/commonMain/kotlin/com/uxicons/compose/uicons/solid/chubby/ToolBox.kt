package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolBox: ImageVector? = null

val Icons.Sc.ToolBox: ImageVector
    get() = _ToolBox ?: UXIcon(name = "ToolBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 9.54f)
                curveToRelative(0.54f, 0f, 0.99f, 0.43f, 1.0f, 0.97f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.01f, -0.54f, 0.46f, -0.97f, 1.0f, -0.97f)
                reflectiveCurveToRelative(0.99f, 0.43f, 1.0f, 0.97f)
                horizontalLineToRelative(4.77f)
                curveToRelative(-0.31f, -2.28f, -0.83f, -3.77f, -0.86f, -3.86f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.56f, -0.7f, -0.64f)
                curveToRelative(-0.09f, -0.02f, -1.31f, -0.32f, -3.15f, -0.57f)
                curveToRelative(-0.14f, -4.44f, -3.7f, -4.44f, -5.05f, -4.44f)
                reflectiveCurveToRelative(-4.91f, 0f, -5.05f, 4.44f)
                curveToRelative(-1.84f, 0.25f, -3.06f, 0.55f, -3.15f, 0.57f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.32f, -0.71f, 0.64f)
                curveToRelative(-0.03f, 0.09f, -0.54f, 1.59f, -0.85f, 3.86f)
                horizontalLineToRelative(4.77f)
                curveToRelative(0.01f, -0.54f, 0.46f, -0.97f, 1.0f, -0.97f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.55f, 0f, 1.95f, 0.15f, 2.04f, 1.15f)
                curveToRelative(-0.65f, -0.04f, -1.34f, -0.06f, -2.04f, -0.06f)
                reflectiveCurveToRelative(-1.38f, 0.02f, -2.04f, 0.06f)
                curveToRelative(0.08f, -0.99f, 0.49f, -1.15f, 2.04f, -1.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.96f, 12.51f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(-0.01f, 0.54f, -0.46f, 0.97f, -1.0f, 0.97f)
                reflectiveCurveToRelative(-0.99f, -0.43f, -1.0f, -0.97f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.01f, 0.54f, -0.46f, 0.97f, -1.0f, 0.97f)
                reflectiveCurveToRelative(-0.99f, -0.43f, -1.0f, -0.97f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(-0.03f, 0.45f, -0.04f, 0.92f, -0.04f, 1.4f)
                curveToRelative(0f, 4.11f, 1.05f, 7.14f, 1.09f, 7.26f)
                curveToRelative(0.11f, 0.32f, 0.38f, 0.56f, 0.7f, 0.64f)
                curveToRelative(0.15f, 0.04f, 3.84f, 1.18f, 8.2f, 1.18f)
                reflectiveCurveToRelative(8.05f, -1.14f, 8.2f, -1.18f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.32f, 0.71f, -0.64f)
                curveToRelative(0.04f, -0.13f, 1.09f, -3.19f, 1.09f, -7.26f)
                curveToRelative(0f, -0.48f, -0.01f, -0.95f, -0.04f, -1.4f)
                close()
            }
        }.also { _ToolBox = it}
