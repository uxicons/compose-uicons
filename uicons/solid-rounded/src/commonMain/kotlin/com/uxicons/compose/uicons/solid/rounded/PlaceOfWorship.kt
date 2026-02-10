package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaceOfWorship: ImageVector? = null

val Icons.Sr.PlaceOfWorship: ImageVector
    get() = _PlaceOfWorship ?: UXIcon(name = "PlaceOfWorship") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(0f, 15.56f)
                verticalLineToRelative(4.94f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-14.62f)
                lineToRelative(-2.94f, 2.14f)
                curveToRelative(-1.29f, 0.94f, -2.06f, 2.44f, -2.06f, 4.04f)
                close()
                moveTo(21.94f, 11.52f)
                lineToRelative(-2.94f, -2.14f)
                verticalLineToRelative(14.62f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.94f)
                curveToRelative(0f, -1.6f, -0.77f, -3.1f, -2.06f, -4.04f)
                close()
                moveTo(13.15f, 0.3f)
                lineToRelative(2.57f, 1.8f)
                curveToRelative(0.8f, 0.56f, 1.28f, 1.48f, 1.28f, 2.46f)
                verticalLineToRelative(19.44f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.85f, -1.68f, -3.31f, -3.6f, -2.94f)
                curveToRelative(-1.42f, 0.28f, -2.4f, 1.61f, -2.4f, 3.06f)
                verticalLineToRelative(4.88f)
                reflectiveCurveToRelative(-2f, 0f, -2f, 0f)
                lineTo(7f, 4.56f)
                curveToRelative(0f, -0.98f, 0.48f, -1.9f, 1.28f, -2.46f)
                lineToRelative(2.57f, -1.8f)
                curveToRelative(0.69f, -0.48f, 1.6f, -0.48f, 2.29f, 0f)
                close()
                moveTo(13.5f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _PlaceOfWorship = it}
