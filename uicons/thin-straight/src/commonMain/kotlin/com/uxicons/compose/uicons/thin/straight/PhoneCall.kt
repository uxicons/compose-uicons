package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Ts.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 1f)
                lineTo(14f, 0f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.19f, 24f, 0f, 14.81f, 0f, 7.61f)
                curveTo(0f, 6.1f, 0.57f, 4.71f, 1.6f, 3.67f)
                lineTo(4.48f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(1.51f, 3.56f, 3.92f, 5.97f, 7.36f, 7.37f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(21.79f, 19.52f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-3.92f, -1.5f, -6.73f, -4.31f, -8.36f, -8.35f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.48f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 6.62f, 8.77f, 15.39f, 15.39f, 15.39f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                close()
            }
        }.also { _PhoneCall = it}
