package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TeamCheck: ImageVector? = null

val Icons.Ss.TeamCheck: ImageVector
    get() = _TeamCheck ?: UXIcon(name = "TeamCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 11f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(12.28f, 12.41f)
                curveToRelative(1.45f, -1.49f, 3.48f, -2.41f, 5.72f, -2.41f)
                curveToRelative(1.05f, 0f, 2.05f, 0.2f, 2.97f, 0.57f)
                curveToRelative(-0.21f, -1.45f, -1.46f, -2.57f, -2.97f, -2.57f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.46f, 0f, -2.68f, 1.05f, -2.95f, 2.44f)
                curveToRelative(0.93f, 0.42f, 1.7f, 1.11f, 2.22f, 1.97f)
                close()
                moveTo(8f, 12f)
                lineTo(3f, 12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                curveToRelative(0f, -1.34f, 0.33f, -2.6f, 0.91f, -3.71f)
                curveToRelative(-0.32f, -1.31f, -1.5f, -2.29f, -2.91f, -2.29f)
                close()
            }
        }.also { _TeamCheck = it}
