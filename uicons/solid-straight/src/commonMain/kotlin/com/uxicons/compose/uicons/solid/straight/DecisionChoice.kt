package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DecisionChoice: ImageVector? = null

val Icons.Ss.DecisionChoice: ImageVector
    get() = _DecisionChoice ?: UXIcon(name = "DecisionChoice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineToRelative(5.92f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                horizontalLineToRelative(-5.91f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                lineTo(2f, 2f)
                lineTo(2f, 11f)
                lineTo(11f, 11f)
                verticalLineToRelative(2f)
                lineTo(5.09f, 13f)
                lineTo(0.59f, 17.5f)
                lineToRelative(4.5f, 4.5f)
                horizontalLineToRelative(5.92f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                lineTo(22f, 13f)
                lineTo(13f, 13f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.46f, 9.46f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(-1.54f, 1.54f)
                close()
                moveTo(14.27f, 15.03f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.81f, 2.97f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.57f, -1.7f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.61f, 1.73f)
                lineToRelative(2.82f, -2.98f)
                close()
            }
        }.also { _DecisionChoice = it}
