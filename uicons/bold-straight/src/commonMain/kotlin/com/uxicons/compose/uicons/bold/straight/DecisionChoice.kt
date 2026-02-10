package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DecisionChoice: ImageVector? = null

val Icons.Bs.DecisionChoice: ImageVector
    get() = _DecisionChoice ?: UXIcon(name = "DecisionChoice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 10.0f)
                horizontalLineToRelative(6.12f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4f, -4f)
                horizontalLineToRelative(-6.12f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                lineTo(2f, 2f)
                verticalLineToRelative(8.0f)
                lineTo(10.5f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.38f, 13f)
                lineTo(0.38f, 17f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(6.12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.5f)
                lineTo(22f, 13f)
                lineTo(13.5f, 13f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.15f, 4.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(16f, 15.92f)
                lineToRelative(-2.94f, 3.03f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.7f, -1.79f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.74f, 1.82f)
                lineToRelative(2.95f, -3.04f)
                lineToRelative(1.4f, 1.43f)
                close()
            }
        }.also { _DecisionChoice = it}
