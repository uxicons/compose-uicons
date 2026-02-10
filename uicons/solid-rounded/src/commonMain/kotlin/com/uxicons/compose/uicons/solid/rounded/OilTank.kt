package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OilTank: ImageVector? = null

val Icons.Sr.OilTank: ImageVector
    get() = _OilTank ?: UXIcon(name = "OilTank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7.4f)
                lineToRelative(-1.07f, 1.05f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.53f, 0.01f, 2.11f)
                curveToRelative(0.57f, 0.57f, 1.55f, 0.57f, 2.12f, 0f)
                curveToRelative(0.58f, -0.56f, 0.58f, -1.56f, 0f, -2.12f)
                lineToRelative(-1.06f, -1.04f)
                close()
                moveTo(23.82f, 6.31f)
                curveToRelative(-0.34f, -2.46f, -2.47f, -4.31f, -4.96f, -4.31f)
                horizontalLineToRelative(-2.86f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2.86f)
                curveToRelative(-2.49f, 0f, -4.62f, 1.85f, -4.96f, 4.31f)
                curveToRelative(-0.24f, 1.73f, -0.24f, 3.65f, 0f, 5.38f)
                curveToRelative(0.34f, 2.46f, 2.47f, 4.31f, 4.96f, 4.31f)
                horizontalLineToRelative(13.73f)
                curveToRelative(2.48f, 0f, 4.62f, -1.85f, 4.96f, -4.31f)
                curveToRelative(0.24f, -1.73f, 0.24f, -3.65f, 0f, -5.38f)
                close()
                moveTo(14.47f, 11.97f)
                curveToRelative(-1.3f, 1.36f, -3.65f, 1.36f, -4.95f, 0f)
                curveToRelative(-1.36f, -1.36f, -1.36f, -3.58f, 0f, -4.95f)
                lineToRelative(1.52f, -1.64f)
                curveToRelative(0.53f, -0.52f, 1.37f, -0.52f, 1.9f, 0f)
                lineToRelative(1.52f, 1.63f)
                curveToRelative(1.37f, 1.31f, 1.37f, 3.65f, 0.01f, 4.96f)
                close()
                moveTo(22.0f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-1.3f, 0f, -2.4f, -0.84f, -2.82f, -2f)
                horizontalLineToRelative(-8.37f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(8.37f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _OilTank = it}
