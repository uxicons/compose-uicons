package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDown: ImageVector? = null

val Icons.Tr.ArrowDown: ImageVector
    get() = _ArrowDown ?: UXIcon(name = "ArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.81f, 19.32f)
                lineToRelative(-4.04f, 3.95f)
                curveToRelative(-0.47f, 0.48f, -1.14f, 0.72f, -1.76f, 0.74f)
                curveToRelative(-0.68f, 0f, -1.28f, -0.25f, -1.77f, -0.72f)
                lineToRelative(-4.08f, -3.92f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(4.09f, 3.92f)
                curveToRelative(0.17f, 0.16f, 0.36f, 0.28f, 0.57f, 0.35f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(22.41f)
                curveToRelative(0.2f, -0.07f, 0.4f, -0.19f, 0.56f, -0.36f)
                lineToRelative(4.05f, -3.95f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                close()
            }
        }.also { _ArrowDown = it}
