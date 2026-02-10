package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Api: ImageVector? = null

val Icons.Ss.Api: ImageVector
    get() = _Api ?: UXIcon(name = "Api") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveToRelative(0f, -0.54f, -0.05f, -1.08f, -0.15f, -1.63f)
                lineToRelative(3.05f, -1.75f)
                lineToRelative(-2.99f, -5.2f)
                lineToRelative(-3.05f, 1.75f)
                curveToRelative(-0.84f, -0.72f, -1.81f, -1.28f, -2.86f, -1.65f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 3.52f)
                curveToRelative(-1.05f, 0.37f, -2.02f, 0.93f, -2.86f, 1.65f)
                lineToRelative(-3.05f, -1.75f)
                lineTo(0.1f, 8.62f)
                lineToRelative(3.05f, 1.75f)
                curveToRelative(-0.1f, 0.54f, -0.15f, 1.09f, -0.15f, 1.63f)
                reflectiveCurveToRelative(0.05f, 1.08f, 0.15f, 1.63f)
                lineTo(0.1f, 15.38f)
                lineToRelative(2.99f, 5.2f)
                lineToRelative(3.05f, -1.75f)
                curveToRelative(0.84f, 0.72f, 1.81f, 1.28f, 2.86f, 1.65f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.52f)
                curveToRelative(1.05f, -0.37f, 2.02f, -0.93f, 2.86f, -1.65f)
                lineToRelative(3.05f, 1.75f)
                lineToRelative(2.99f, -5.2f)
                lineToRelative(-3.05f, -1.75f)
                curveToRelative(0.1f, -0.54f, 0.15f, -1.09f, 0.15f, -1.63f)
                close()
                moveTo(9.71f, 13.75f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.71f, -1.71f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.71f, 1.69f)
                close()
                moveTo(11.98f, 17.2f)
                lineToRelative(-1.96f, -0.39f)
                lineToRelative(2f, -10f)
                lineToRelative(1.96f, 0.39f)
                lineToRelative(-2f, 10f)
                close()
                moveTo(17.42f, 13.45f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(-1.71f, -1.7f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                close()
            }
        }.also { _Api = it}
