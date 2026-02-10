package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Rr.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
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
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13.88f, 5.88f)
                lineTo(6.46f, 13.29f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                verticalLineToRelative(0.67f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.67f)
                curveToRelative(1.34f, 0f, 2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(7.4f, -7.4f)
                curveToRelative(1.17f, -1.06f, 1.17f, -3.2f, 0.02f, -4.26f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                close()
                moveTo(9.29f, 16.12f)
                curveToRelative(-0.6f, 0.61f, -1.44f, 0.92f, -2.29f, 0.88f)
                curveToRelative(-0.04f, -0.86f, 0.27f, -1.69f, 0.88f, -2.29f)
                lineToRelative(4.96f, -4.96f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.96f, 4.96f)
                close()
                moveTo(16.71f, 8.71f)
                lineTo(15.66f, 9.75f)
                lineTo(14.25f, 8.34f)
                lineTo(15.3f, 7.29f)
                curveToRelative(0.38f, -0.38f, 1.02f, -0.39f, 1.43f, 0.02f)
                curveToRelative(0.36f, 0.34f, 0.36f, 1.06f, -0.02f, 1.4f)
                close()
            }
        }.also { _SquarePen = it}
