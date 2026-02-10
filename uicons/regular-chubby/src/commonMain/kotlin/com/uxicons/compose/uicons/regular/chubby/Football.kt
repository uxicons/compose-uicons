package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Rc.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(16.88f, 10.49f)
                lineToRelative(3.77f, -2.05f)
                curveToRelative(0.23f, 1.0f, 0.36f, 2.18f, 0.36f, 3.56f)
                reflectiveCurveToRelative(-0.12f, 2.56f, -0.36f, 3.56f)
                lineToRelative(-3.77f, -2.05f)
                verticalLineToRelative(-3.03f)
                close()
                moveTo(19.96f, 6.53f)
                lineToRelative(-3.92f, 2.13f)
                curveToRelative(-0.97f, -0.74f, -2.28f, -1.4f, -3.04f, -1.75f)
                lineTo(13f, 3.02f)
                curveToRelative(3.2f, 0.13f, 5.66f, 0.95f, 6.96f, 3.51f)
                close()
                moveTo(12f, 15.34f)
                curveToRelative(-0.77f, -0.36f, -2.06f, -1.02f, -2.88f, -1.66f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0.82f, -0.64f, 2.11f, -1.31f, 2.88f, -1.67f)
                curveToRelative(0.77f, 0.35f, 2.06f, 1f, 2.87f, 1.63f)
                verticalLineToRelative(3.38f)
                curveToRelative(-0.82f, 0.64f, -2.11f, 1.3f, -2.88f, 1.66f)
                close()
                moveTo(11f, 3.02f)
                verticalLineToRelative(3.9f)
                curveToRelative(-0.75f, 0.36f, -2.04f, 1.02f, -3.02f, 1.76f)
                lineToRelative(-3.95f, -2.15f)
                curveToRelative(1.3f, -2.56f, 3.77f, -3.38f, 6.96f, -3.51f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.38f, 0.12f, -2.56f, 0.36f, -3.56f)
                lineToRelative(3.77f, 2.05f)
                verticalLineToRelative(3.03f)
                lineToRelative(-3.77f, 2.05f)
                curveToRelative(-0.23f, -1.0f, -0.36f, -2.18f, -0.36f, -3.56f)
                close()
                moveTo(4.04f, 17.47f)
                lineToRelative(3.95f, -2.15f)
                curveToRelative(0.97f, 0.74f, 2.27f, 1.4f, 3.02f, 1.75f)
                verticalLineToRelative(3.9f)
                curveToRelative(-3.2f, -0.13f, -5.66f, -0.95f, -6.96f, -3.51f)
                close()
                moveTo(13f, 20.98f)
                verticalLineToRelative(-3.9f)
                curveToRelative(0.75f, -0.36f, 2.05f, -1.02f, 3.02f, -1.75f)
                lineToRelative(3.95f, 2.15f)
                curveToRelative(-1.3f, 2.56f, -3.77f, 3.38f, -6.96f, 3.51f)
                close()
            }
        }.also { _Football = it}
