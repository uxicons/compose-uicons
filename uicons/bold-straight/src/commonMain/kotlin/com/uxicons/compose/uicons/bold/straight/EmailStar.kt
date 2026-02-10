package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailStar: ImageVector? = null

val Icons.Bs.EmailStar: ImageVector
    get() = _EmailStar ?: UXIcon(name = "EmailStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 14.72f)
                lineToRelative(3f, -2.1f)
                verticalLineToRelative(11.38f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.28f)
                lineToRelative(7.36f, 7.54f)
                curveToRelative(0.88f, 0.88f, 2.4f, 0.88f, 3.28f, 0f)
                lineToRelative(0.32f, -0.32f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-2.44f, 2.44f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineToRelative(-5.24f, -5.39f)
                verticalLineToRelative(9.95f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6.28f)
                close()
                moveTo(19.83f, 4.36f)
                lineTo(18.54f, 0f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.28f, 4.36f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(1.01f)
                lineToRelative(3.08f, 2.02f)
                lineToRelative(-1.18f, 4.02f)
                lineToRelative(0.79f, 0.59f)
                lineToRelative(3.33f, -2.34f)
                lineToRelative(3.38f, 2.34f)
                lineToRelative(0.82f, -0.57f)
                lineToRelative(-1.27f, -3.98f)
                lineToRelative(3.05f, -2.08f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.17f)
                close()
            }
        }.also { _EmailStar = it}
