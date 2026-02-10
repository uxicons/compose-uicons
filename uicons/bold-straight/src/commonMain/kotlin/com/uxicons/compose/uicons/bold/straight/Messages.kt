package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Messages: ImageVector? = null

val Icons.Bs.Messages: ImageVector
    get() = _Messages ?: UXIcon(name = "Messages") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 5.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                reflectiveCurveTo(15.44f, 0f, 14.5f, 0f)
                horizontalLineToRelative(-0.0f)
                lineTo(3.5f, 0.01f)
                curveTo(2.57f, 0.01f, 1.69f, 0.37f, 1.03f, 1.03f)
                reflectiveCurveTo(0f, 2.57f, 0f, 3.51f)
                lineToRelative(0.01f, 13.62f)
                curveToRelative(0f, 1.03f, 0.84f, 1.87f, 1.87f, 1.87f)
                curveToRelative(0.18f, 0f, 0.37f, -0.03f, 0.54f, -0.08f)
                lineToRelative(3.58f, -1.5f)
                verticalLineToRelative(4.58f)
                horizontalLineToRelative(11f)
                lineToRelative(4.44f, 1.86f)
                lineToRelative(0.14f, 0.05f)
                curveToRelative(0.18f, 0.05f, 0.36f, 0.08f, 0.54f, 0.08f)
                curveToRelative(1.03f, 0f, 1.87f, -0.84f, 1.87f, -1.87f)
                lineToRelative(0.01f, -13.62f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.18f, 0.09f, -0.3f, 0.15f, -0.35f)
                curveToRelative(0.06f, -0.06f, 0.17f, -0.15f, 0.35f, -0.15f)
                lineToRelative(11f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.18f, 0f, 0.3f, 0.09f, 0.35f, 0.15f)
                curveToRelative(0.06f, 0.06f, 0.15f, 0.17f, 0.15f, 0.35f)
                verticalLineToRelative(10.5f)
                lineTo(6.4f, 14.01f)
                lineToRelative(-3.39f, 1.42f)
                lineToRelative(-0.01f, -11.92f)
                close()
                moveTo(21.0f, 20.43f)
                lineToRelative(-3.39f, -1.42f)
                horizontalLineToRelative(-8.6f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineToRelative(-0.01f, 11.92f)
                close()
            }
        }.also { _Messages = it}
