package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareEnvelope: ImageVector? = null

val Icons.Rs.SquareEnvelope: ImageVector
    get() = _SquareEnvelope ?: UXIcon(name = "SquareEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 8f)
                curveToRelative(0.12f, 0f, 0.24f, 0.03f, 0.34f, 0.07f)
                lineToRelative(-3.64f, 3.64f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-3.64f, -3.64f)
                curveToRelative(0.11f, -0.04f, 0.22f, -0.07f, 0.34f, -0.07f)
                horizontalLineToRelative(8f)
                close()
                moveTo(7f, 16f)
                verticalLineToRelative(-5.76f)
                lineToRelative(2.88f, 2.88f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(2.88f, -2.88f)
                verticalLineToRelative(5.76f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _SquareEnvelope = it}
