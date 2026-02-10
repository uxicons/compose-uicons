package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TaskChecklist: ImageVector? = null

val Icons.Bs.TaskChecklist: ImageVector
    get() = _TaskChecklist ?: UXIcon(name = "TaskChecklist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12.91f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(14.09f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.47f, 0f, 0.91f, 0.1f, 1.32f, 0.26f)
                lineToRelative(-2.74f, 2.74f)
                horizontalLineToRelative(-11.59f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(14f)
                close()
                moveTo(23.36f, 0.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(-3.06f, 3f)
                horizontalLineToRelative(4.59f)
                close()
                moveTo(6.66f, 15.72f)
                lineTo(5.73f, 14.84f)
                lineTo(3.67f, 17.02f)
                lineTo(5.1f, 18.37f)
                curveToRelative(0.45f, 0.42f, 1.01f, 0.63f, 1.57f, 0.63f)
                curveToRelative(0.58f, 0f, 1.17f, -0.23f, 1.62f, -0.68f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(6.66f, 9.72f)
                lineTo(5.73f, 8.84f)
                lineTo(3.67f, 11.02f)
                lineTo(5.1f, 12.37f)
                curveToRelative(0.45f, 0.42f, 1.01f, 0.63f, 1.57f, 0.63f)
                curveToRelative(0.58f, 0f, 1.17f, -0.23f, 1.62f, -0.68f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _TaskChecklist = it}
