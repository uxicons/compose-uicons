package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeftFromBracket: ImageVector? = null

val Icons.Sr.LeftFromBracket: ImageVector
    get() = _LeftFromBracket ?: UXIcon(name = "LeftFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(11.15f, 21.75f)
                curveToRelative(1.14f, -0.47f, 1.84f, -1.52f, 1.85f, -2.75f)
                verticalLineToRelative(-2.05f)
                lineToRelative(2f, 0.01f)
                curveToRelative(2.19f, 0f, 3.97f, -1.78f, 3.97f, -3.97f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -2.19f, -1.78f, -3.97f, -3.96f, -3.97f)
                lineToRelative(-2.04f, -0.02f)
                verticalLineToRelative(-2.07f)
                curveToRelative(-0.01f, -1.23f, -0.71f, -2.28f, -1.85f, -2.74f)
                curveToRelative(-1.13f, -0.47f, -2.38f, -0.22f, -3.22f, 0.63f)
                lineTo(1.16f, 9.16f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.01f, -0.02f, 0.02f)
                curveToRelative(-1.55f, 1.55f, -1.55f, 4.07f, 0.03f, 5.64f)
                lineToRelative(6.75f, 6.28f)
                curveToRelative(0.58f, 0.58f, 1.32f, 0.88f, 2.09f, 0.88f)
                curveToRelative(0.39f, 0f, 0.78f, -0.08f, 1.15f, -0.23f)
                close()
            }
        }.also { _LeftFromBracket = it}
