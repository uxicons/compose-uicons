package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TaskChecklist: ImageVector? = null

val Icons.Ss.TaskChecklist: ImageVector
    get() = _TaskChecklist ?: UXIcon(name = "TaskChecklist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.54f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-7.67f, 7.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
                moveTo(16.42f, 14f)
                horizontalLineToRelative(-6.42f)
                verticalLineToRelative(-6.42f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(-0.17f, -0.03f, -0.35f, -0.05f, -0.53f, -0.05f)
                horizontalLineToRelative(-14.5f)
                curveToRelative(-1.65f, 0f, -2.5f, 1.35f, -2.5f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-13.58f)
                close()
                moveTo(6.77f, 18.47f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(6.77f, 13.47f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.26f, 0.53f)
                curveToRelative(-0.44f, -0.0f, -0.88f, -0.17f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(6.77f, 8.47f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.26f, 0.53f)
                curveToRelative(-0.44f, -0.0f, -0.88f, -0.17f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-6.96f)
                lineToRelative(2.04f, -2f)
                horizontalLineToRelative(4.92f)
                close()
            }
        }.also { _TaskChecklist = it}
