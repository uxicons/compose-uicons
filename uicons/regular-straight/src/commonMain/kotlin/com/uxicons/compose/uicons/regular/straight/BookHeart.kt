package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookHeart: ImageVector? = null

val Icons.Rs.BookHeart: ImageVector
    get() = _BookHeart ?: UXIcon(name = "BookHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(17f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 18f)
                lineTo(5f, 18f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(16f)
                close()
                moveTo(11.43f, 14.15f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.45f, -0.32f, 4.43f, -3.17f, 4.43f, -5.93f)
                curveToRelative(0f, -1.77f, -1.35f, -3.22f, -3f, -3.22f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.22f)
                curveToRelative(0f, 2.77f, 3.98f, 5.62f, 4.43f, 5.93f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0.48f, 0f, 1f, 0.26f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.74f, 0.52f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.55f, 1f, 1.22f)
                curveToRelative(0f, 1.08f, -1.6f, 2.77f, -3f, 3.87f)
                curveToRelative(-1.4f, -1.1f, -3f, -2.78f, -3f, -3.87f)
                curveToRelative(0f, -0.67f, 0.45f, -1.22f, 1f, -1.22f)
                close()
            }
        }.also { _BookHeart = it}
