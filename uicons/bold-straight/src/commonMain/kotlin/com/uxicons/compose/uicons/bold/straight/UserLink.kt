package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLink: ImageVector? = null

val Icons.Bs.UserLink: ImageVector
    get() = _UserLink ?: UXIcon(name = "UserLink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(15.84f, 21.81f)
                curveToRelative(0.75f, 0.38f, 1.57f, 0.59f, 2.39f, 0.64f)
                lineToRelative(-0.38f, 0.38f)
                curveToRelative(-1.57f, 1.57f, -4.11f, 1.57f, -5.68f, 0f)
                curveToRelative(0f, 0f, 0f, -0.0f, -0.0f, -0.0f)
                curveToRelative(-1.56f, -1.57f, -1.56f, -4.11f, 0.0f, -5.68f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(1.57f, -1.57f, 4.11f, -1.57f, 5.68f, 0f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, -0.78f, -2.06f, -0.78f, -2.84f, 0f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.06f, 0f, 2.84f)
                curveToRelative(0.61f, 0.61f, 1.51f, 0.74f, 2.25f, 0.4f)
                close()
                moveTo(22.82f, 17.86f)
                lineTo(21.41f, 19.27f)
                curveToRelative(-0.78f, 0.78f, -1.81f, 1.17f, -2.84f, 1.17f)
                reflectiveCurveToRelative(-2.06f, -0.39f, -2.84f, -1.17f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.78f, 0.78f, 2.06f, 0.78f, 2.84f, 0f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.06f, 0f, -2.84f)
                curveToRelative(-0.61f, -0.61f, -1.51f, -0.74f, -2.25f, -0.4f)
                curveToRelative(-0.75f, -0.38f, -1.57f, -0.59f, -2.39f, -0.64f)
                lineToRelative(0.38f, -0.38f)
                curveToRelative(1.57f, -1.57f, 4.11f, -1.57f, 5.68f, 0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(1.57f, 1.57f, 1.57f, 4.12f, 0f, 5.68f)
                close()
                moveTo(12.49f, 14f)
                lineTo(10.76f, 15.73f)
                curveToRelative(-0.39f, 0.39f, -0.68f, 0.82f, -0.94f, 1.27f)
                horizontalLineToRelative(-4.32f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                close()
            }
        }.also { _UserLink = it}
