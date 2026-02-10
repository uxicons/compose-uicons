package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Rs.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(7.46f, 11.31f)
                lineTo(8.85f, 9.87f)
                lineTo(10.09f, 11.02f)
                lineTo(12.4f, 8.62f)
                lineTo(13.8f, 10.05f)
                lineTo(11.5f, 12.44f)
                lineTo(11.5f, 12.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.21f, -1.11f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(20.5f, 20.44f)
                lineTo(20.5f, 20.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.21f, -1.11f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.15f)
                lineToRelative(2.31f, -2.4f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.3f, 2.39f)
                close()
                moveTo(15f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Tasks = it}
