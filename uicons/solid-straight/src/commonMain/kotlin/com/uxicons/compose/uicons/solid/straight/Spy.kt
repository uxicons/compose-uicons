package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spy: ImageVector? = null

val Icons.Ss.Spy: ImageVector
    get() = _Spy ?: UXIcon(name = "Spy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.89f, 15.12f)
                lineToRelative(6.11f, 7.63f)
                verticalLineToRelative(1.25f)
                lineTo(3f, 24.0f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.57f, 0.75f, -2.96f, 1.89f, -3.88f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(-0.57f, -1.82f, -1.71f, -4f, -3.1f, -4f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.58f, -2.5f, 1.13f)
                curveToRelative(-0.64f, -0.55f, -1.52f, -1.13f, -2.5f, -1.13f)
                curveToRelative(-1.39f, 0f, -2.52f, 2.18f, -3.1f, 4f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.11f, 15.12f)
                lineToRelative(-6.11f, 7.63f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.57f, -0.75f, -2.96f, -1.89f, -3.88f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                lineToRelative(-3.82f, -5f)
                horizontalLineToRelative(0f)
                lineToRelative(-2.68f, -3.5f)
                reflectiveCurveToRelative(0.8f, -0.77f, 2.34f, -1.45f)
                curveToRelative(-0.37f, -0.62f, -0.63f, -1.31f, -0.75f, -2.05f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.12f, 0.74f, -0.39f, 1.43f, -0.75f, 2.05f)
                curveToRelative(1.55f, 0.69f, 2.34f, 1.45f, 2.34f, 1.45f)
                lineToRelative(-2.68f, 3.5f)
                horizontalLineToRelative(0f)
                lineToRelative(-3.82f, 5f)
                close()
                moveTo(14.03f, 15f)
                lineToRelative(1.05f, -2.85f)
                curveToRelative(-0.9f, 0.54f, -1.95f, 0.85f, -3.08f, 0.85f)
                reflectiveCurveToRelative(-2.18f, -0.31f, -3.08f, -0.85f)
                lineToRelative(1.05f, 2.85f)
                horizontalLineToRelative(4.05f)
                close()
            }
        }.also { _Spy = it}
