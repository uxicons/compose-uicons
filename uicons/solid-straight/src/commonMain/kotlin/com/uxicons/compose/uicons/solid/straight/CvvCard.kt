package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CvvCard: ImageVector? = null

val Icons.Ss.CvvCard: ImageVector
    get() = _CvvCard ?: UXIcon(name = "CvvCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                lineTo(24f, 21f)
                lineTo(24f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(11f)
                close()
                moveTo(19.24f, 13f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(14.74f, 13f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(8.99f, 14.98f)
                curveToRelative(0f, -1.09f, 0.89f, -1.99f, 2f, -1.99f)
                horizontalLineToRelative(0f)
                curveToRelative(1.1f, 0.01f, 2f, 0.9f, 2f, 1.99f)
                verticalLineToRelative(0.08f)
                horizontalLineToRelative(-1.25f)
                reflectiveCurveToRelative(0.01f, -0.05f, 0.01f, -0.08f)
                curveToRelative(0f, -0.39f, -0.34f, -0.73f, -0.75f, -0.73f)
                curveToRelative(-0.39f, 0f, -0.75f, 0.3f, -0.75f, 0.75f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.45f, 0.36f, 0.75f, 0.75f, 0.75f)
                curveToRelative(0.41f, -0.01f, 0.75f, -0.34f, 0.75f, -0.73f)
                curveToRelative(0f, -0.03f, -0.01f, -0.08f, -0.01f, -0.08f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.09f, -0.9f, 1.98f, -2f, 1.98f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.11f, 0.0f, -2f, -0.89f, -2f, -1.98f)
                verticalLineToRelative(-2.03f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(2f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _CvvCard = it}
