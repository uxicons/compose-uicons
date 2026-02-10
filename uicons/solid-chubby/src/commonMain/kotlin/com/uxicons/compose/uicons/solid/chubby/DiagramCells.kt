package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramCells: ImageVector? = null

val Icons.Sc.DiagramCells: ImageVector
    get() = _DiagramCells ?: UXIcon(name = "DiagramCells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 21.21f)
                curveToRelative(-0.07f, 0.34f, -0.33f, 0.62f, -0.66f, 0.73f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -9.32f, 1.05f)
                reflectiveCurveToRelative(-9.19f, -1.01f, -9.32f, -1.05f)
                curveToRelative(-0.33f, -0.11f, -0.58f, -0.39f, -0.66f, -0.73f)
                curveToRelative(-0.03f, -0.14f, -0.74f, -3.41f, -0.96f, -7.16f)
                curveToRelative(-0.04f, -0.56f, 0.44f, -1.07f, 1.0f, -1.06f)
                horizontalLineToRelative(19.87f)
                curveToRelative(2.4f, 0.35f, -0.35f, 8.64f, 0.04f, 8.21f)
                close()
                moveTo(2.06f, 11f)
                horizontalLineToRelative(19.87f)
                curveToRelative(0.56f, 0.01f, 1.04f, -0.5f, 1.0f, -1.06f)
                curveToRelative(-0.22f, -3.75f, -0.93f, -7.02f, -0.96f, -7.16f)
                curveToRelative(-0.07f, -0.34f, -0.33f, -0.62f, -0.66f, -0.73f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.33f, 0.11f, -0.58f, 0.39f, -0.66f, 0.73f)
                curveToRelative(-0.03f, 0.14f, -0.74f, 3.41f, -0.96f, 7.16f)
                curveToRelative(-0.04f, 0.56f, 0.44f, 1.07f, 1.0f, 1.06f)
                close()
            }
        }.also { _DiagramCells = it}
