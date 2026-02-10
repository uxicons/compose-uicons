package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileQuestion: ImageVector? = null

val Icons.Ts.FileQuestion: ImageVector
    get() = _FileQuestion ?: UXIcon(name = "FileQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.9f, 11.21f)
                curveToRelative(0.34f, 1.3f, -0.2f, 2.65f, -1.32f, 3.34f)
                curveToRelative(-0.67f, 0.42f, -1.07f, 1.08f, -1.07f, 1.77f)
                verticalLineToRelative(0.67f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -1.04f, 0.58f, -2.03f, 1.55f, -2.62f)
                curveToRelative(0.77f, -0.47f, 1.11f, -1.35f, 0.88f, -2.24f)
                curveToRelative(-0.17f, -0.67f, -0.72f, -1.22f, -1.39f, -1.39f)
                curveToRelative(-0.63f, -0.16f, -1.27f, -0.04f, -1.76f, 0.35f)
                curveToRelative(-0.49f, 0.38f, -0.78f, 0.96f, -0.78f, 1.58f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -0.94f, 0.42f, -1.8f, 1.17f, -2.37f)
                curveToRelative(0.74f, -0.57f, 1.7f, -0.77f, 2.63f, -0.52f)
                curveToRelative(1.02f, 0.26f, 1.84f, 1.09f, 2.11f, 2.11f)
                close()
            }
        }.also { _FileQuestion = it}
