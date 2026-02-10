package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroadcastTower: ImageVector? = null

val Icons.Ts.BroadcastTower: ImageVector
    get() = _BroadcastTower ?: UXIcon(name = "BroadcastTower") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.48f, 1.08f, 2.72f, 2.5f, 2.96f)
                verticalLineToRelative(12.04f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-12.04f)
                curveToRelative(1.42f, -0.24f, 2.5f, -1.47f, 2.5f, -2.96f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(7.05f, 4.12f)
                curveToRelative(-1.32f, 1.32f, -2.05f, 3.08f, -2.05f, 4.95f)
                reflectiveCurveToRelative(0.73f, 3.63f, 2.05f, 4.95f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-3.12f, -3.12f, -3.12f, -8.2f, 0f, -11.31f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(17.66f, 14.73f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(3.12f, 3.12f, 3.12f, 8.2f, 0f, 11.31f)
                close()
                moveTo(4.22f, 16.85f)
                lineToRelative(-0.71f, 0.71f)
                curveTo(-1.16f, 12.88f, -1.16f, 5.27f, 3.52f, 0.59f)
                lineToRelative(0.71f, 0.71f)
                curveTo(-0.07f, 5.59f, -0.07f, 12.56f, 4.22f, 16.85f)
                close()
                moveTo(20.48f, 17.56f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(4.29f, -4.29f, 4.29f, -11.27f, 0f, -15.56f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(4.68f, 4.68f, 4.68f, 12.29f, 0f, 16.97f)
                close()
            }
        }.also { _BroadcastTower = it}
