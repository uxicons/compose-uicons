package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramCells: ImageVector? = null

val Icons.Tc.DiagramCells: ImageVector
    get() = _DiagramCells ?: UXIcon(name = "DiagramCells") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.52f, 11f)
                horizontalLineToRelative(20.96f)
                curveToRelative(0.27f, 0.01f, 0.51f, -0.24f, 0.5f, -0.51f)
                curveToRelative(-0.15f, -5.31f, -1.02f, -7.98f, -1.05f, -8.09f)
                curveToRelative(-0.05f, -0.15f, -0.17f, -0.27f, -0.32f, -0.32f)
                curveToRelative(-0.13f, -0.04f, -3.3f, -1.08f, -9.61f, -1.08f)
                reflectiveCurveToRelative(-9.48f, 1.03f, -9.61f, 1.08f)
                curveToRelative(-0.15f, 0.05f, -0.27f, 0.17f, -0.32f, 0.32f)
                curveToRelative(-0.04f, 0.11f, -0.9f, 2.79f, -1.05f, 8.09f)
                curveToRelative(-0.01f, 0.27f, 0.23f, 0.52f, 0.5f, 0.51f)
                close()
                moveTo(2.95f, 2.95f)
                curveToRelative(0.85f, -0.23f, 3.89f, -0.95f, 9.05f, -0.95f)
                reflectiveCurveToRelative(8.2f, 0.72f, 9.05f, 0.95f)
                curveToRelative(0.2f, 0.73f, 0.76f, 3.1f, 0.91f, 7.05f)
                horizontalLineToRelative(-19.92f)
                curveToRelative(0.15f, -3.94f, 0.71f, -6.31f, 0.91f, -7.05f)
                close()
                moveTo(22.48f, 13f)
                horizontalLineToRelative(-20.96f)
                curveToRelative(-0.27f, -0.01f, -0.51f, 0.24f, -0.5f, 0.51f)
                curveToRelative(0.15f, 5.31f, 1.02f, 7.98f, 1.05f, 8.09f)
                curveToRelative(0.05f, 0.15f, 0.17f, 0.27f, 0.32f, 0.32f)
                curveToRelative(0.13f, 0.04f, 3.3f, 1.08f, 9.61f, 1.08f)
                reflectiveCurveToRelative(9.48f, -1.03f, 9.61f, -1.08f)
                curveToRelative(0.15f, -0.05f, 0.27f, -0.17f, 0.32f, -0.32f)
                curveToRelative(0.04f, -0.11f, 0.9f, -2.79f, 1.05f, -8.09f)
                curveToRelative(0.01f, -0.27f, -0.23f, -0.52f, -0.5f, -0.51f)
                close()
                moveTo(21.05f, 21.05f)
                curveToRelative(-0.85f, 0.23f, -3.89f, 0.95f, -9.05f, 0.95f)
                reflectiveCurveToRelative(-8.2f, -0.72f, -9.05f, -0.95f)
                curveToRelative(-0.2f, -0.73f, -0.76f, -3.1f, -0.91f, -7.05f)
                horizontalLineToRelative(19.92f)
                curveToRelative(-0.15f, 3.94f, -0.71f, 6.31f, -0.91f, 7.05f)
                close()
            }
        }.also { _DiagramCells = it}
