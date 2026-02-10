package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Ts.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -1.38f, -0.27f, -2.69f, -0.73f, -3.91f)
                lineToRelative(0.78f, -0.78f)
                curveToRelative(0.61f, 1.44f, 0.95f, 3.02f, 0.95f, 4.68f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                curveToRelative(1.38f, 0f, 2.69f, 0.27f, 3.91f, 0.73f)
                lineToRelative(0.78f, -0.78f)
                curveToRelative(-1.44f, -0.61f, -3.02f, -0.95f, -4.68f, -0.95f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.98f, 2.69f, 9.33f, 7.38f, 11.94f)
                lineToRelative(0.48f, -0.88f)
                curveToRelative(-4.36f, -2.42f, -6.86f, -6.46f, -6.86f, -11.06f)
                close()
                moveTo(12f, 8.46f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                lineToRelative(-7.73f, 7.73f)
                horizontalLineToRelative(-3.54f)
                verticalLineToRelative(-3.54f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(2.12f)
                lineToRelative(7.44f, -7.44f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.57f, -0.57f, -1.55f, -0.57f, -2.12f, 0f)
                lineToRelative(-7.44f, 7.44f)
                verticalLineToRelative(2.12f)
                close()
            }
        }.also { _PenSwirl = it}
