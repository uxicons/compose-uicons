package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Sc.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.88f, 10.29f)
                curveToRelative(-0.81f, -0.63f, -2.1f, -1.28f, -2.87f, -1.63f)
                curveToRelative(-0.77f, 0.36f, -2.06f, 1.03f, -2.88f, 1.67f)
                verticalLineToRelative(3.35f)
                curveToRelative(0.82f, 0.64f, 2.11f, 1.3f, 2.88f, 1.66f)
                curveToRelative(0.77f, -0.36f, 2.06f, -1.02f, 2.88f, -1.66f)
                verticalLineToRelative(-3.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.99f, 8.68f)
                curveToRelative(0.97f, -0.73f, 2.27f, -1.4f, 3.02f, -1.76f)
                verticalLineTo(1.02f)
                curveToRelative(-3.38f, 0.12f, -6.9f, 0.98f, -8.72f, 4.56f)
                lineToRelative(5.71f, 3.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6.92f)
                curveToRelative(0.76f, 0.35f, 2.07f, 1.01f, 3.04f, 1.75f)
                lineToRelative(5.68f, -3.09f)
                curveToRelative(-1.83f, -3.58f, -5.35f, -4.43f, -8.72f, -4.56f)
                verticalLineTo(6.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 13.51f)
                lineToRelative(5.57f, 3.03f)
                curveToRelative(0.35f, -1.26f, 0.55f, -2.76f, 0.55f, -4.54f)
                reflectiveCurveToRelative(-0.2f, -3.28f, -0.55f, -4.54f)
                lineToRelative(-5.57f, 3.03f)
                verticalLineToRelative(3.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.02f, 15.32f)
                curveToRelative(-0.97f, 0.74f, -2.27f, 1.4f, -3.02f, 1.75f)
                verticalLineToRelative(5.91f)
                curveToRelative(3.38f, -0.12f, 6.9f, -0.98f, 8.72f, -4.56f)
                lineToRelative(-5.71f, -3.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.12f, 10.49f)
                lineTo(1.55f, 7.46f)
                curveToRelative(-0.35f, 1.26f, -0.55f, 2.76f, -0.55f, 4.54f)
                reflectiveCurveToRelative(0.2f, 3.28f, 0.55f, 4.54f)
                lineToRelative(5.57f, -3.03f)
                verticalLineToRelative(-3.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17.08f)
                curveToRelative(-0.75f, -0.36f, -2.05f, -1.02f, -3.02f, -1.75f)
                lineToRelative(-5.71f, 3.1f)
                curveToRelative(1.83f, 3.58f, 5.35f, 4.43f, 8.72f, 4.56f)
                verticalLineToRelative(-5.91f)
                close()
            }
        }.also { _Football = it}
