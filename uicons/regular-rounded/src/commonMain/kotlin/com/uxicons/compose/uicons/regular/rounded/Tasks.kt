package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Rr.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8.17f, 10.58f)
                curveToRelative(0.38f, -0.39f, 1.0f, -0.41f, 1.4f, -0.04f)
                lineToRelative(0.52f, 0.48f)
                lineToRelative(1.59f, -1.65f)
                curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.44f, -0.01f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.01f, 1.39f)
                lineToRelative(-1.63f, 1.69f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-0.46f, -0.42f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.02f, -0.04f, -1.43f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(22.13f, 18.75f)
                lineTo(20.5f, 20.44f)
                lineTo(20.5f, 20.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-0.46f, -0.42f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.02f, -0.04f, -1.43f)
                curveToRelative(0.38f, -0.39f, 1.0f, -0.41f, 1.4f, -0.04f)
                lineToRelative(0.52f, 0.48f)
                lineToRelative(1.59f, -1.65f)
                curveToRelative(0.39f, -0.41f, 1.04f, -0.41f, 1.44f, -0.01f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.0f, 0.01f, 1.39f)
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
