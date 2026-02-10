package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareEnvelope: ImageVector? = null

val Icons.Ts.SquareEnvelope: ImageVector
    get() = _SquareEnvelope ?: UXIcon(name = "SquareEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16.5f, 6f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(0.32f, 0f, 0.61f, 0.1f, 0.85f, 0.27f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-4.29f, -4.29f)
                curveToRelative(0.24f, -0.17f, 0.54f, -0.27f, 0.85f, -0.27f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.14f, 0.03f, -0.27f, 0.06f, -0.4f)
                lineToRelative(4.17f, 4.17f)
                curveToRelative(0.93f, 0.97f, 2.61f, 0.97f, 3.54f, 0f)
                lineToRelative(4.17f, -4.17f)
                curveToRelative(0.04f, 0.13f, 0.06f, 0.26f, 0.06f, 0.4f)
                close()
            }
        }.also { _SquareEnvelope = it}
