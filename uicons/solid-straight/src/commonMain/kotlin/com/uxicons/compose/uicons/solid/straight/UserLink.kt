package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLink: ImageVector? = null

val Icons.Ss.UserLink: ImageVector
    get() = _UserLink ?: UXIcon(name = "UserLink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(13.6f, 21.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.06f, 0f, -2.84f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.78f, -0.78f, 2.06f, -0.78f, 2.84f, 0f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(-1.57f, -1.57f, -4.11f, -1.57f, -5.68f, 0f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-1.57f, 1.57f, -1.57f, 4.11f, -0.0f, 5.68f)
                curveToRelative(0f, 0f, 0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(1.57f, 1.57f, 4.11f, 1.57f, 5.68f, 0f)
                lineToRelative(0.38f, -0.38f)
                curveToRelative(-0.82f, -0.04f, -1.64f, -0.25f, -2.39f, -0.64f)
                curveToRelative(-0.74f, 0.34f, -1.64f, 0.21f, -2.25f, -0.4f)
                close()
                moveTo(22.83f, 12.18f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.57f, -1.57f, -4.11f, -1.57f, -5.68f, 0f)
                lineToRelative(-0.38f, 0.38f)
                curveToRelative(0.82f, 0.04f, 1.64f, 0.25f, 2.39f, 0.64f)
                curveToRelative(0.74f, -0.34f, 1.64f, -0.21f, 2.25f, 0.4f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.06f, 0f, 2.84f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -2.06f, 0.78f, -2.84f, 0f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(0.78f, 0.78f, 1.81f, 1.17f, 2.84f, 1.17f)
                reflectiveCurveToRelative(2.06f, -0.39f, 2.84f, -1.17f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(1.57f, -1.57f, 1.57f, -4.11f, 0f, -5.68f)
                close()
                moveTo(10.76f, 15.73f)
                lineTo(12.49f, 14f)
                horizontalLineToRelative(-7.49f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10.56f)
                curveToRelative(-2.13f, -2.36f, -2.08f, -6.0f, 0.2f, -8.27f)
                close()
            }
        }.also { _UserLink = it}
