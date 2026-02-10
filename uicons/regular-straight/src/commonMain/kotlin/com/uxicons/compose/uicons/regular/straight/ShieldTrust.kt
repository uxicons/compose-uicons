package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldTrust: ImageVector? = null

val Icons.Rs.ShieldTrust: ImageVector
    get() = _ShieldTrust ?: UXIcon(name = "ShieldTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 12f)
                lineToRelative(-3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(-4.98f)
                lineToRelative(-3.52f, 3.52f)
                lineToRelative(-3.52f, -3.52f)
                lineTo(3.5f, 20.5f)
                verticalLineToRelative(-4.98f)
                lineTo(-0.02f, 12f)
                lineToRelative(3.52f, -3.52f)
                lineTo(3.5f, 3.5f)
                horizontalLineToRelative(4.98f)
                lineTo(12f, -0.02f)
                lineToRelative(3.52f, 3.52f)
                horizontalLineToRelative(3.73f)
                lineToRelative(-2.02f, 2f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(-2.69f, 2.69f)
                horizontalLineToRelative(-3.81f)
                verticalLineToRelative(3.81f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(2.69f, 2.69f)
                verticalLineToRelative(3.81f)
                horizontalLineToRelative(3.81f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(2.69f, -2.69f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(-3.81f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-0.99f, -0.99f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(2.4f, 2.4f)
                close()
                moveTo(11.55f, 13.96f)
                lineToRelative(9.75f, -9.67f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-9.81f, 9.73f)
                curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.35f, 0.56f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.2f, -1.35f, -0.56f)
                lineToRelative(-3.9f, -3.84f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(3.85f, 3.79f)
                close()
                moveTo(11.61f, 14.02f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, -0.0f)
                horizontalLineToRelative(-0.01f)
                close()
            }
        }.also { _ShieldTrust = it}
