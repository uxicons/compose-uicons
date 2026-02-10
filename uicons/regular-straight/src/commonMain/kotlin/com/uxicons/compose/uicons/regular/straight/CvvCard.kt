package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CvvCard: ImageVector? = null

val Icons.Rs.CvvCard: ImageVector
    get() = _CvvCard ?: UXIcon(name = "CvvCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 15f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                close()
                moveTo(12.99f, 15.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.11f, -0.0f, -2f, 0.89f, -2f, 1.98f)
                verticalLineToRelative(2.03f)
                curveToRelative(0f, 1.09f, 0.89f, 1.99f, 2f, 1.99f)
                horizontalLineToRelative(0f)
                curveToRelative(1.1f, -0.01f, 2f, -0.9f, 2f, -1.99f)
                verticalLineToRelative(-0.08f)
                horizontalLineToRelative(-1.25f)
                reflectiveCurveToRelative(0.01f, 0.05f, 0.01f, 0.08f)
                curveToRelative(0f, 0.39f, -0.34f, 0.73f, -0.75f, 0.73f)
                curveToRelative(-0.39f, 0f, -0.75f, -0.3f, -0.75f, -0.75f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0f, -0.45f, 0.36f, -0.75f, 0.75f, -0.75f)
                curveToRelative(0.41f, 0.01f, 0.75f, 0.34f, 0.75f, 0.73f)
                curveToRelative(0f, 0.03f, -0.01f, 0.08f, -0.01f, 0.08f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0f, -1.09f, -0.9f, -1.98f, -2f, -1.98f)
                close()
                moveTo(22.06f, 18.28f)
                lineToRelative(-0.83f, -3.28f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(1.51f, 6f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.25f, -6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-0.68f, 3.28f)
                close()
                moveTo(24.0f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(2f, 10f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.99f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.71f, 0.2f, 1.38f, 0.54f, 1.97f)
                horizontalLineToRelative(-1.53f)
                verticalLineToRelative(0.01f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22.0f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(22f, 8f)
                close()
            }
        }.also { _CvvCard = it}
