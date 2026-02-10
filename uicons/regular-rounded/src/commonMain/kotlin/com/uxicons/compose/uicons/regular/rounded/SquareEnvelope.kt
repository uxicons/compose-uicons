package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareEnvelope: ImageVector? = null

val Icons.Rr.SquareEnvelope: ImageVector
    get() = _SquareEnvelope ?: UXIcon(name = "SquareEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(15f, 8f)
                curveToRelative(0.46f, 0f, 0.87f, 0.16f, 1.21f, 0.41f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(0.34f, -0.26f, 0.75f, -0.41f, 1.21f, -0.41f)
                horizontalLineToRelative(6f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.55f)
                lineToRelative(2.52f, 2.52f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.48f, 1.03f)
                reflectiveCurveToRelative(1.81f, -0.36f, 2.48f, -1.02f)
                lineToRelative(2.52f, -2.52f)
                verticalLineToRelative(3.55f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _SquareEnvelope = it}
