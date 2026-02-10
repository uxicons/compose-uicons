package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFingerClick: ImageVector? = null

val Icons.Ts.CursorFingerClick: ImageVector
    get() = _CursorFingerClick ?: UXIcon(name = "CursorFingerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(7.96f, 6.26f)
                lineTo(4.43f, 2.72f)
                lineTo(3.72f, 3.43f)
                lineTo(7.26f, 6.96f)
                close()
                moveTo(17.0f, 11f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.01f, 1f)
                close()
                moveTo(6.0f, 10f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.01f, -1f)
                close()
                moveTo(14.0f, 15.66f)
                lineTo(14f, 10.61f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(9.61f)
                lineToRelative(-1.83f, -1.45f)
                verticalLineToRelative(0.0f)
                curveToRelative(-1.01f, -0.91f, -2.57f, -0.85f, -3.5f, 0.14f)
                curveToRelative(-0.94f, 1.01f, -0.89f, 2.59f, 0.11f, 3.52f)
                lineToRelative(1.78f, 1.68f)
                horizontalLineToRelative(1.44f)
                lineToRelative(-2.54f, -2.41f)
                curveToRelative(-0.6f, -0.56f, -0.63f, -1.51f, -0.06f, -2.12f)
                curveToRelative(0.56f, -0.6f, 1.51f, -0.64f, 2.12f, -0.07f)
                curveToRelative(0.01f, 0.01f, 3.48f, 2.77f, 3.48f, 2.77f)
                verticalLineToRelative(-11.69f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.25f, 0.8f, 1.25f, 1.59f)
                lineToRelative(-0.0f, 5.74f)
                lineToRelative(9.0f, 3.5f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.89f)
                lineToRelative(-9.0f, -3.5f)
                close()
                moveTo(19.28f, 3.43f)
                lineTo(18.57f, 2.72f)
                lineTo(15.04f, 6.26f)
                lineTo(15.74f, 6.96f)
                close()
            }
        }.also { _CursorFingerClick = it}
