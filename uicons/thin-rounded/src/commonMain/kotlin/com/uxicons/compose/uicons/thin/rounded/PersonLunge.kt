package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Tr.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(19.5f, 16f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0f, -1.6f, -1.3f, -2.9f, -2.9f, -2.9f)
                curveToRelative(-1.16f, 0f, -2.26f, 0.44f, -3.1f, 1.24f)
                lineToRelative(-2.52f, 2.39f)
                curveToRelative(-0.49f, 0.45f, -0.62f, 1.18f, -0.33f, 1.77f)
                lineToRelative(1.66f, 3.33f)
                curveToRelative(0.12f, 0.25f, 0.42f, 0.35f, 0.67f, 0.22f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.22f, -0.67f)
                lineToRelative(-1.66f, -3.33f)
                curveToRelative(-0.1f, -0.2f, -0.06f, -0.44f, 0.11f, -0.6f)
                curveToRelative(0f, 0f, 2.73f, -2.56f, 2.83f, -2.64f)
                verticalLineToRelative(6.78f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11f, 14.5f)
                lineTo(11f, 7.19f)
                curveToRelative(0.35f, -0.12f, 0.72f, -0.19f, 1.1f, -0.19f)
                curveToRelative(1.05f, 0f, 1.9f, 0.85f, 1.9f, 1.9f)
                verticalLineToRelative(7.1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.96f, 18.69f)
                lineToRelative(-1.75f, 4.37f)
                curveToRelative(-0.23f, 0.57f, -0.77f, 0.94f, -1.39f, 0.94f)
                lineTo(2.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(7.82f, 23f)
                curveToRelative(0.2f, 0f, 0.39f, -0.12f, 0.46f, -0.31f)
                lineToRelative(1.75f, -4.37f)
                curveToRelative(0.1f, -0.26f, 0.39f, -0.38f, 0.65f, -0.28f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.39f, 0.28f, 0.65f)
                close()
            }
        }.also { _PersonLunge = it}
