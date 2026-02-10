package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leader: ImageVector? = null

val Icons.Sr.Leader: ImageVector
    get() = _Leader ?: UXIcon(name = "Leader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                lineTo(9f, 7.85f)
                curveToRelative(-0.04f, -0.02f, -6.62f, -5.14f, -6.62f, -5.14f)
                curveToRelative(-0.44f, -0.34f, -0.51f, -0.97f, -0.17f, -1.4f)
                curveToRelative(0.34f, -0.43f, 0.97f, -0.51f, 1.4f, -0.17f)
                lineToRelative(6.23f, 4.87f)
                horizontalLineToRelative(3.65f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.39f, -0.82f, 2.58f, -2f, 3.15f)
                verticalLineToRelative(4.35f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Leader = it}
